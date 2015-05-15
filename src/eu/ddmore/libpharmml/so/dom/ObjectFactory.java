//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.20 at 11:14:40 AM GMT 
//


package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.commontypes.StringValue;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import eu.ddmore.libpharmml.so.impl.SOXMLFilter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ddmore.libpharmml.so.dom package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IndivFitsObservationTable_QNAME = new QName(SOXMLFilter.NS_SO, "ObservationTable");
    private final static QName _IndivFitsPredictionTable_QNAME = new QName(SOXMLFilter.NS_SO, "PredictionTable");
    private final static QName _DiagnosticPlotsStructuralModelIndivFits_QNAME = new QName(SOXMLFilter.NS_SO, "IndivFits");
    private final static QName _DiagnosticPlotsStructuralModelIndivPredictionVsObserv_QNAME = new QName(SOXMLFilter.NS_SO, "IndivPredictionVsObserv");
    private final static QName _DiagnosticPlotsStructuralModelVPC_QNAME = new QName(SOXMLFilter.NS_SO, "VPC");
    private final static QName _TargetToolMessagesTermination_QNAME = new QName(SOXMLFilter.NS_SO, "Termination");
    private final static QName _TargetToolMessagesWarnings_QNAME = new QName(SOXMLFilter.NS_SO, "Warnings");
    private final static QName _TargetToolMessagesErrors_QNAME = new QName(SOXMLFilter.NS_SO, "Errors");
    private final static QName _TargetToolMessagesElapsedTime_QNAME = new QName(SOXMLFilter.NS_SO, "ElapsedTime");
    private final static QName _TargetToolMessagesOutputFilePath_QNAME = new QName(SOXMLFilter.NS_SO, "OutputFilePath");
    private final static QName _TargetToolMessagesChainsNumber_QNAME = new QName(SOXMLFilter.NS_SO, "ChainsNumber");
    private final static QName _TargetToolMessagesIterationNumber_QNAME = new QName(SOXMLFilter.NS_SO, "IterationNumber");
    private final static QName _InformationCriteriaAIC_QNAME = new QName(SOXMLFilter.NS_SO, "AIC");
    private final static QName _InformationCriteriaBIC_QNAME = new QName(SOXMLFilter.NS_SO, "BIC");
    private final static QName _InformationCriteriaDIC_QNAME = new QName(SOXMLFilter.NS_SO, "DIC");
    private final static QName _LikelihoodLogLikelihood_QNAME = new QName(SOXMLFilter.NS_SO, "LogLikelihood");
    private final static QName _LikelihoodDeviance_QNAME = new QName(SOXMLFilter.NS_SO, "Deviance");
    private final static QName _LikelihoodIndividualContribToLL_QNAME = new QName(SOXMLFilter.NS_SO, "IndividualContribToLL");
    private final static QName _LikelihoodInformationCriteria_QNAME = new QName(SOXMLFilter.NS_SO, "InformationCriteria");
    private final static QName _IndividualEstimatesRandomEffectsEffectMean_QNAME = new QName(SOXMLFilter.NS_SO, "EffectMean");
    private final static QName _IndividualEstimatesRandomEffectsEffectMedian_QNAME = new QName(SOXMLFilter.NS_SO, "EffectMedian");
    private final static QName _IndividualEstimatesRandomEffectsEffectMode_QNAME = new QName(SOXMLFilter.NS_SO, "EffectMode");
    private final static QName _IndividualEstimatesRandomEffectsSamples_QNAME = new QName(SOXMLFilter.NS_SO, "Samples");
    private final static QName _IndividualEstimatesEstimatesMean_QNAME = new QName(SOXMLFilter.NS_SO, "Mean");
    private final static QName _IndividualEstimatesEstimatesMedian_QNAME = new QName(SOXMLFilter.NS_SO, "Median");
    private final static QName _IndividualEstimatesEstimatesMode_QNAME = new QName(SOXMLFilter.NS_SO, "Mode");
    private final static QName _PrecisionPopulationEstimatesMLEFIM_QNAME = new QName(SOXMLFilter.NS_SO, "FIM");
    private final static QName _PrecisionPopulationEstimatesMLECovarianceMatrix_QNAME = new QName(SOXMLFilter.NS_SO, "CovarianceMatrix");
    private final static QName _PrecisionPopulationEstimatesMLECorrelationMatrix_QNAME = new QName(SOXMLFilter.NS_SO, "CorrelationMatrix");
    private final static QName _PrecisionPopulationEstimatesMLEStandardError_QNAME = new QName(SOXMLFilter.NS_SO, "StandardError");
    private final static QName _PrecisionPopulationEstimatesMLERelativeStandardError_QNAME = new QName(SOXMLFilter.NS_SO, "RelativeStandardError");
    private final static QName _PrecisionPopulationEstimatesMLEAsymptoticCI_QNAME = new QName(SOXMLFilter.NS_SO, "AsymptoticCI");
    private final static QName _RawResultsDataFile_QNAME = new QName(SOXMLFilter.NS_SO, "DataFile");
    private final static QName _RawResultsGraphicsFile_QNAME = new QName(SOXMLFilter.NS_SO, "GraphicsFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ddmore.libpharmml.so.dom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndividualEstimates }
     * 
     */
    public IndividualEstimates createIndividualEstimates() {
        return new IndividualEstimates();
    }

    /**
     * Create an instance of {@link PrecisionPopulationEstimates }
     * 
     */
    public PrecisionPopulationEstimates createPrecisionPopulationEstimates() {
        return new PrecisionPopulationEstimates();
    }

    /**
     * Create an instance of {@link PopulationEstimates }
     * 
     */
    public PopulationEstimates createPopulationEstimates() {
        return new PopulationEstimates();
    }

    /**
     * Create an instance of {@link StandardisedOutput }
     * 
     */
    public StandardisedOutput createSO() {
        return new StandardisedOutput();
    }

    /**
     * Create an instance of {@link PharmMLRef }
     * 
     */
    public PharmMLRef createPharmMLRefType() {
        return new PharmMLRef();
    }

    /**
     * Create an instance of {@link RawResults }
     * 
     */
    public RawResults createRawResults() {
        return new RawResults();
    }

    /**
     * Create an instance of {@link TaskInformation }
     * 
     */
    public TaskInformation createTaskInformationType() {
        return new TaskInformation();
    }

    /**
     * Create an instance of {@link Estimation }
     * 
     */
    public Estimation createEstimationType() {
        return new Estimation();
    }

    /**
     * Create an instance of {@link ModelDiagnostic }
     * 
     */
    public ModelDiagnostic createModelDiagnostic() {
        return new ModelDiagnostic();
    }

    /**
     * Create an instance of {@link Simulation }
     * 
     */
    public Simulation createSimulation() {
        return new Simulation();
    }

    /**
     * Create an instance of {@link SOBlock }
     * 
     */
    public SOBlock createSOBlock() {
        return new SOBlock();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link SOMatrix }
     * 
     */
    public SOMatrix createSOMatrix() {
        return new SOMatrix();
    }

    /**
     * Create an instance of {@link SOTableDistrib }
     * 
     */
    public SOTableDistrib createSOTableDistrib() {
        return new SOTableDistrib();
    }

    /**
     * Create an instance of {@link Residuals }
     * 
     */
    public Residuals createResiduals() {
        return new Residuals();
    }

    /**
     * Create an instance of {@link PrecisionEstimatesPercentile }
     * 
     */
    public PrecisionEstimatesPercentile createPrecisionEstimatesPercentile() {
        return new PrecisionEstimatesPercentile();
    }

    /**
     * Create an instance of {@link Likelihood }
     * 
     */
    public Likelihood createLikelihood() {
        return new Likelihood();
    }

    /**
     * Create an instance of {@link InformationCriteria }
     * 
     */
    public InformationCriteria createInformationCriteria() {
        return new InformationCriteria();
    }

    /**
     * Create an instance of {@link TargetToolMessages }
     * 
     */
    public TargetToolMessages createTargetToolMessages() {
        return new TargetToolMessages();
    }

    /**
     * Create an instance of {@link SimulationBlock }
     * 
     */
    public SimulationBlock createSimulationBlock() {
        return new SimulationBlock();
    }

    /**
     * Create an instance of {@link DiagnosticPlotsStructuralModel }
     * 
     */
    public DiagnosticPlotsStructuralModel createDiagnosticPlotsStructuralModel() {
        return new DiagnosticPlotsStructuralModel();
    }

    /**
     * Create an instance of {@link IndivFits }
     * 
     */
    public IndivFits createIndivFits() {
        return new IndivFits();
    }

    /**
     * Create an instance of {@link IndividualEstimates.Estimates }
     * 
     */
    public IndividualEstimates.Estimates createIndividualEstimatesEstimates() {
        return new IndividualEstimates.Estimates();
    }

    /**
     * Create an instance of {@link IndividualEstimates.RandomEffects }
     * 
     */
    public IndividualEstimates.RandomEffects createIndividualEstimatesRandomEffects() {
        return new IndividualEstimates.RandomEffects();
    }

    /**
     * Create an instance of {@link PrecisionPopulationEstimates.MLE }
     * 
     */
    public PrecisionPopulationEstimates.MLE createPrecisionPopulationEstimatesMLE() {
        return new PrecisionPopulationEstimates.MLE();
    }

    /**
     * Create an instance of {@link PrecisionPopulationEstimates.Bayesian }
     * 
     */
    public PrecisionPopulationEstimates.Bayesian createPrecisionPopulationEstimatesBayesian() {
        return new PrecisionPopulationEstimates.Bayesian();
    }

    /**
     * Create an instance of {@link PopulationEstimates.Bayesian }
     * 
     */
    public PopulationEstimates.Bayesian createPopulationEstimatesBayesian() {
        return new PopulationEstimates.Bayesian();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "ObservationTable", scope = IndivFits.class)
    public JAXBElement<DataSet> createIndivFitsObservationTable(DataSet value) {
        return new JAXBElement<DataSet>(_IndivFitsObservationTable_QNAME, DataSet.class, IndivFits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "PredictionTable", scope = IndivFits.class)
    public JAXBElement<DataSet> createIndivFitsPredictionTable(DataSet value) {
        return new JAXBElement<DataSet>(_IndivFitsPredictionTable_QNAME, DataSet.class, IndivFits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndivFits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "IndivFits", scope = DiagnosticPlotsStructuralModel.class)
    public JAXBElement<IndivFits> createDiagnosticPlotsStructuralModelIndivFits(IndivFits value) {
        return new JAXBElement<IndivFits>(_DiagnosticPlotsStructuralModelIndivFits_QNAME, IndivFits.class, DiagnosticPlotsStructuralModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "IndivPredictionVsObserv", scope = DiagnosticPlotsStructuralModel.class)
    public JAXBElement<DataSet> createDiagnosticPlotsStructuralModelIndivPredictionVsObserv(DataSet value) {
        return new JAXBElement<DataSet>(_DiagnosticPlotsStructuralModelIndivPredictionVsObserv_QNAME, DataSet.class, DiagnosticPlotsStructuralModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "VPC", scope = DiagnosticPlotsStructuralModel.class)
    public JAXBElement<DataSet> createDiagnosticPlotsStructuralModelVPC(DataSet value) {
        return new JAXBElement<DataSet>(_DiagnosticPlotsStructuralModelVPC_QNAME, DataSet.class, DiagnosticPlotsStructuralModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Termination", scope = TargetToolMessages.class)
    public JAXBElement<StringValue> createTargetToolMessagesTermination(StringValue value) {
        return new JAXBElement<StringValue>(_TargetToolMessagesTermination_QNAME, StringValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Warnings", scope = TargetToolMessages.class)
    public JAXBElement<StringValue> createTargetToolMessagesWarnings(StringValue value) {
        return new JAXBElement<StringValue>(_TargetToolMessagesWarnings_QNAME, StringValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Errors", scope = TargetToolMessages.class)
    public JAXBElement<StringValue> createTargetToolMessagesErrors(StringValue value) {
        return new JAXBElement<StringValue>(_TargetToolMessagesErrors_QNAME, StringValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "ElapsedTime", scope = TargetToolMessages.class)
    public JAXBElement<RealValue> createTargetToolMessagesElapsedTime(RealValue value) {
        return new JAXBElement<RealValue>(_TargetToolMessagesElapsedTime_QNAME, RealValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "OutputFilePath", scope = TargetToolMessages.class)
    public JAXBElement<ExternalFile> createTargetToolMessagesOutputFilePath(ExternalFile value) {
        return new JAXBElement<ExternalFile>(_TargetToolMessagesOutputFilePath_QNAME, ExternalFile.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "ChainsNumber", scope = TargetToolMessages.class)
    public JAXBElement<RealValue> createTargetToolMessagesChainsNumber(RealValue value) {
        return new JAXBElement<RealValue>(_TargetToolMessagesChainsNumber_QNAME, RealValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "IterationNumber", scope = TargetToolMessages.class)
    public JAXBElement<RealValue> createTargetToolMessagesIterationNumber(RealValue value) {
        return new JAXBElement<RealValue>(_TargetToolMessagesIterationNumber_QNAME, RealValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "AIC", scope = InformationCriteria.class)
    public JAXBElement<RealValue> createInformationCriteriaAIC(RealValue value) {
        return new JAXBElement<RealValue>(_InformationCriteriaAIC_QNAME, RealValue.class, InformationCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "BIC", scope = InformationCriteria.class)
    public JAXBElement<RealValue> createInformationCriteriaBIC(RealValue value) {
        return new JAXBElement<RealValue>(_InformationCriteriaBIC_QNAME, RealValue.class, InformationCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "DIC", scope = InformationCriteria.class)
    public JAXBElement<RealValue> createInformationCriteriaDIC(RealValue value) {
        return new JAXBElement<RealValue>(_InformationCriteriaDIC_QNAME, RealValue.class, InformationCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "LogLikelihood", scope = Likelihood.class)
    public JAXBElement<RealValue> createLikelihoodLogLikelihood(RealValue value) {
        return new JAXBElement<RealValue>(_LikelihoodLogLikelihood_QNAME, RealValue.class, Likelihood.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Deviance", scope = Likelihood.class)
    public JAXBElement<RealValue> createLikelihoodDeviance(RealValue value) {
        return new JAXBElement<RealValue>(_LikelihoodDeviance_QNAME, RealValue.class, Likelihood.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "IndividualContribToLL", scope = Likelihood.class)
    public JAXBElement<DataSet> createLikelihoodIndividualContribToLL(DataSet value) {
        return new JAXBElement<DataSet>(_LikelihoodIndividualContribToLL_QNAME, DataSet.class, Likelihood.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "InformationCriteria", scope = Likelihood.class)
    public JAXBElement<InformationCriteria> createLikelihoodInformationCriteria(InformationCriteria value) {
        return new JAXBElement<InformationCriteria>(_LikelihoodInformationCriteria_QNAME, InformationCriteria.class, Likelihood.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "EffectMean", scope = IndividualEstimates.RandomEffects.class)
    public JAXBElement<DataSet> createIndividualEstimatesRandomEffectsEffectMean(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsEffectMean_QNAME, DataSet.class, IndividualEstimates.RandomEffects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "EffectMedian", scope = IndividualEstimates.RandomEffects.class)
    public JAXBElement<DataSet> createIndividualEstimatesRandomEffectsEffectMedian(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsEffectMedian_QNAME, DataSet.class, IndividualEstimates.RandomEffects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "EffectMode", scope = IndividualEstimates.RandomEffects.class)
    public JAXBElement<DataSet> createIndividualEstimatesRandomEffectsEffectMode(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsEffectMode_QNAME, DataSet.class, IndividualEstimates.RandomEffects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Samples", scope = IndividualEstimates.RandomEffects.class)
    public JAXBElement<DataSet> createIndividualEstimatesRandomEffectsSamples(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsSamples_QNAME, DataSet.class, IndividualEstimates.RandomEffects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Mean", scope = IndividualEstimates.Estimates.class)
    public JAXBElement<DataSet> createIndividualEstimatesEstimatesMean(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesEstimatesMean_QNAME, DataSet.class, IndividualEstimates.Estimates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Median", scope = IndividualEstimates.Estimates.class)
    public JAXBElement<DataSet> createIndividualEstimatesEstimatesMedian(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesEstimatesMedian_QNAME, DataSet.class, IndividualEstimates.Estimates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Mode", scope = IndividualEstimates.Estimates.class)
    public JAXBElement<DataSet> createIndividualEstimatesEstimatesMode(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesEstimatesMode_QNAME, DataSet.class, IndividualEstimates.Estimates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "Samples", scope = IndividualEstimates.Estimates.class)
    public JAXBElement<DataSet> createIndividualEstimatesEstimatesSamples(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsSamples_QNAME, DataSet.class, IndividualEstimates.Estimates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "FIM", scope = PrecisionPopulationEstimates.MLE.class)
    public JAXBElement<SOMatrix> createPrecisionPopulationEstimatesMLEFIM(SOMatrix value) {
        return new JAXBElement<SOMatrix>(_PrecisionPopulationEstimatesMLEFIM_QNAME, SOMatrix.class, PrecisionPopulationEstimates.MLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "CovarianceMatrix", scope = PrecisionPopulationEstimates.MLE.class)
    public JAXBElement<SOMatrix> createPrecisionPopulationEstimatesMLECovarianceMatrix(SOMatrix value) {
        return new JAXBElement<SOMatrix>(_PrecisionPopulationEstimatesMLECovarianceMatrix_QNAME, SOMatrix.class, PrecisionPopulationEstimates.MLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOMatrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "CorrelationMatrix", scope = PrecisionPopulationEstimates.MLE.class)
    public JAXBElement<SOMatrix> createPrecisionPopulationEstimatesMLECorrelationMatrix(SOMatrix value) {
        return new JAXBElement<SOMatrix>(_PrecisionPopulationEstimatesMLECorrelationMatrix_QNAME, SOMatrix.class, PrecisionPopulationEstimates.MLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "StandardError", scope = PrecisionPopulationEstimates.MLE.class)
    public JAXBElement<DataSet> createPrecisionPopulationEstimatesMLEStandardError(DataSet value) {
        return new JAXBElement<DataSet>(_PrecisionPopulationEstimatesMLEStandardError_QNAME, DataSet.class, PrecisionPopulationEstimates.MLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "RelativeStandardError", scope = PrecisionPopulationEstimates.MLE.class)
    public JAXBElement<DataSet> createPrecisionPopulationEstimatesMLERelativeStandardError(DataSet value) {
        return new JAXBElement<DataSet>(_PrecisionPopulationEstimatesMLERelativeStandardError_QNAME, DataSet.class, PrecisionPopulationEstimates.MLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "AsymptoticCI", scope = PrecisionPopulationEstimates.MLE.class)
    public JAXBElement<DataSet> createPrecisionPopulationEstimatesMLEAsymptoticCI(DataSet value) {
        return new JAXBElement<DataSet>(_PrecisionPopulationEstimatesMLEAsymptoticCI_QNAME, DataSet.class, PrecisionPopulationEstimates.MLE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "DataFile", scope = RawResults.class)
    public JAXBElement<ExternalFile> createRawResultsDataFile(ExternalFile value) {
        return new JAXBElement<ExternalFile>(_RawResultsDataFile_QNAME, ExternalFile.class, RawResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = SOXMLFilter.NS_SO, name = "GraphicsFile", scope = RawResults.class)
    public JAXBElement<ExternalFile> createRawResultsGraphicsFile(ExternalFile value) {
        return new JAXBElement<ExternalFile>(_RawResultsGraphicsFile_QNAME, ExternalFile.class, RawResults.class, value);
    }

}
