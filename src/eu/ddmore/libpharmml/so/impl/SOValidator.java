package eu.ddmore.libpharmml.so.impl;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBSource;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import eu.ddmore.libpharmml.IValidationReport;
import eu.ddmore.libpharmml.impl.LoggerWrapper;
import eu.ddmore.libpharmml.impl.ValidationReportFactory;
import eu.ddmore.libpharmml.so.StandardisedOutputResource;
import eu.ddmore.libpharmml.so.dom.StandardisedOutput;
//import eu.ddmore.libpharmml.validation.SymbolResolver;

public class SOValidator {

	private static final String CONTEXT_NAME = Messages.getString("SOMarshaller.contextDefn"); //$NON-NLS-1$

	public IValidationReport createValidationReport(StandardisedOutputResource resource) {
		try{
			StandardisedOutput dom = resource.getDom();
			
			String writtenVersion = dom.getWrittenVersion();
			SOVersion docVersion = null;
			if(writtenVersion != null){
				docVersion = SOVersion.getEnum(writtenVersion);
			}
			if(docVersion == null){
				docVersion = SOVersion.DEFAULT;
				LoggerWrapper.getLogger().warning("Missing or unknown writtenVersion of SO document. Using default version ("+docVersion+").");
			}

			JAXBContext jc = JAXBContext.newInstance(CONTEXT_NAME);
			JAXBSource source = new JAXBSource(jc, dom);
	 
			Schema schema = SOSchemaFactory.getInstance().createSOSchema(docVersion);
			Validator validator = schema.newValidator();
			final ValidationReportFactory rptFact = new ValidationReportFactory();
			validator.setErrorHandler(new ErrorHandler() {
				
				@Override
				public void warning(SAXParseException exception) throws SAXException {
					rptFact.handleWarning(exception.getMessage());
				}
				
				@Override
				public void fatalError(SAXParseException exception) throws SAXException {
					rptFact.handleError(exception.getMessage());
				}
				
				@Override
				public void error(SAXParseException exception) throws SAXException {
					rptFact.handleError(exception.getMessage());
				}
			});
			validator.validate(source);
			
			// symbol resolution
//			SymbolResolver resolver = new SymbolResolver(dom);
//			List<IValidationError> resolvErrors = resolver.resolveSymbols();
//			for(IValidationError error : resolvErrors){
//				rptFact.addError(error);
//			}
//			List<IValidationError> unicityErrors = resolver.checkUnicity();
//			for(IValidationError error : unicityErrors){
//				rptFact.addError(error);
//			}
			
			return rptFact.createReport();
		}
		catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (JAXBException e) {
			throw new RuntimeException(e.getMessage(), e);
        } catch (SAXException e) {
			throw new RuntimeException(e.getMessage(), e);
        }
	}

	
}
