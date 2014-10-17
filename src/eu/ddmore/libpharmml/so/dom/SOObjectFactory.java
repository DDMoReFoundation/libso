package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.JAXBElement;

import eu.ddmore.libpharmml.dom.MasterObjectFactory;
import eu.ddmore.libpharmml.dom.uncertml.AbstractContinuousMultivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.AbstractContinuousUnivariateDistributionType;
import eu.ddmore.libpharmml.dom.uncertml.BetaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.CauchyDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ChiSquareDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ContinuousMultivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.ContinuousUnivariateMixtureModel;
import eu.ddmore.libpharmml.dom.uncertml.DiracDeltaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.DirichletDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ExponentialDistribution;
import eu.ddmore.libpharmml.dom.uncertml.FDistribution;
import eu.ddmore.libpharmml.dom.uncertml.GammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.InverseGammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LaplaceDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LogNormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.LogisticDistribution;
import eu.ddmore.libpharmml.dom.uncertml.MultivariateNormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.MultivariateStudentTDistribution;
import eu.ddmore.libpharmml.dom.uncertml.NormalDistribution;
import eu.ddmore.libpharmml.dom.uncertml.NormalInverseGammaDistribution;
import eu.ddmore.libpharmml.dom.uncertml.ObjectFactory;
import eu.ddmore.libpharmml.dom.uncertml.ParetoDistribution;
import eu.ddmore.libpharmml.dom.uncertml.StudentTDistribution;
import eu.ddmore.libpharmml.dom.uncertml.UniformDistribution;
import eu.ddmore.libpharmml.dom.uncertml.WeibullDistribution;

/**
 * Temp class. Enclosed methods will be moved to {@link MasterObjectFactory}.
 * @author florent
 *
 */
class SOObjectFactory {

	private static ObjectFactory UNCERTML_OF = MasterObjectFactory.UNCERTML_OF;
	
	public static JAXBElement<? extends AbstractContinuousUnivariateDistributionType> 
	createContinuousUnivariateDistribution(AbstractContinuousUnivariateDistributionType distrib){
		
		JAXBElement<? extends AbstractContinuousUnivariateDistributionType> el;
		
		if(distrib instanceof WeibullDistribution){
			el = UNCERTML_OF.createWeibullDistribution((WeibullDistribution) distrib);
		} else if(distrib instanceof DiracDeltaDistribution){
			el = UNCERTML_OF.createDiracDeltaDistribution((DiracDeltaDistribution) distrib);
		} else if(distrib instanceof FDistribution){
			el = UNCERTML_OF.createFDistribution((FDistribution) distrib);
		} else if(distrib instanceof StudentTDistribution){
			el = UNCERTML_OF.createStudentTDistribution((StudentTDistribution) distrib);
		} else if(distrib instanceof ContinuousUnivariateMixtureModel){
			el = UNCERTML_OF.createContinuousUnivariateMixtureModel((ContinuousUnivariateMixtureModel) distrib);
		} else if(distrib instanceof LaplaceDistribution){
			el = UNCERTML_OF.createLaplaceDistribution((LaplaceDistribution) distrib);
		} else if(distrib instanceof UniformDistribution){
			el = UNCERTML_OF.createUniformDistribution((UniformDistribution) distrib);
		} else if(distrib instanceof CauchyDistribution){
			el = UNCERTML_OF.createCauchyDistribution((CauchyDistribution) distrib);
		} else if(distrib instanceof ChiSquareDistribution){
			el = UNCERTML_OF.createChiSquareDistribution((ChiSquareDistribution) distrib);
		} else if(distrib instanceof NormalDistribution){
			el = UNCERTML_OF.createNormalDistribution((NormalDistribution) distrib);
		} else if(distrib instanceof InverseGammaDistribution){
			el = UNCERTML_OF.createInverseGammaDistribution((InverseGammaDistribution) distrib);
		} else if(distrib instanceof LogNormalDistribution){
			el = UNCERTML_OF.createLogNormalDistribution((LogNormalDistribution) distrib);
		} else if(distrib instanceof BetaDistribution){
			el = UNCERTML_OF.createBetaDistribution((BetaDistribution) distrib);
		} else if(distrib instanceof ParetoDistribution){
			el = UNCERTML_OF.createParetoDistribution((ParetoDistribution) distrib);
		} else if(distrib instanceof ExponentialDistribution){
			el = UNCERTML_OF.createExponentialDistribution((ExponentialDistribution) distrib);
		} else if(distrib instanceof LogisticDistribution){
			el = UNCERTML_OF.createLogisticDistribution((LogisticDistribution) distrib);
		} else if(distrib instanceof GammaDistribution){
			el = UNCERTML_OF.createGammaDistribution((GammaDistribution) distrib);
		} else {
			throw new IllegalArgumentException("Unknown AbstractContinuousUnivariateDistributionType");
		}
		return el;
	}
	
	public static JAXBElement<? extends AbstractContinuousMultivariateDistributionType> 
	createContinuousMultivariateDistributionType(AbstractContinuousMultivariateDistributionType distrib){
		
		JAXBElement<? extends AbstractContinuousMultivariateDistributionType> el;
		
		if(distrib instanceof NormalInverseGammaDistribution){
			el = UNCERTML_OF.createNormalInverseGammaDistribution((NormalInverseGammaDistribution) distrib);
		} else if(distrib instanceof ContinuousMultivariateMixtureModel){
			el = UNCERTML_OF.createContinuousMultivariateMixtureModel((ContinuousMultivariateMixtureModel) distrib);
		} else if(distrib instanceof MultivariateNormalDistribution){
			el = UNCERTML_OF.createMultivariateNormalDistribution((MultivariateNormalDistribution) distrib);
		} else if(distrib instanceof MultivariateStudentTDistribution){
			el = UNCERTML_OF.createMultivariateStudentTDistribution((MultivariateStudentTDistribution) distrib);
		} else if(distrib instanceof DirichletDistribution){
			el = UNCERTML_OF.createDirichletDistribution((DirichletDistribution) distrib);
		} else {
			throw new IllegalArgumentException("Unknown AbstractContinuousMultivariateDistributionType");
		}
		return el;
	}
}
