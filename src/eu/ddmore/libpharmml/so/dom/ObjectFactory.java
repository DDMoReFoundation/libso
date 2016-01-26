/*******************************************************************************
 * Copyright (c) 2014-2016 European Molecular Biology Laboratory,
 * Heidelberg, Germany.
 * 
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of
 * the License at
 * 
 *  		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on 
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations 
 * under the License.
 ******************************************************************************/
package eu.ddmore.libpharmml.so.dom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import eu.ddmore.libpharmml.dom.commontypes.RealValue;
import eu.ddmore.libpharmml.dom.commontypes.StringValue;
import eu.ddmore.libpharmml.dom.dataset.DataSet;
import eu.ddmore.libpharmml.dom.dataset.ExternalFile;
import static eu.ddmore.libpharmml.so.impl.SOXMLFilter.NS_SO;


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

    private final static QName _SO_QNAME = new QName(NS_SO, "SO");
    private final static QName _TargetToolMessagesIterationNumber_QNAME = new QName(NS_SO, "IterationNumber");
    private final static QName _TargetToolMessagesOutputFilePath_QNAME = new QName(NS_SO, "OutputFilePath");
    private final static QName _TargetToolMessagesChainsNumber_QNAME = new QName(NS_SO, "ChainsNumber");
    private final static QName _TargetToolMessagesErrors_QNAME = new QName(NS_SO, "Errors");
    private final static QName _TargetToolMessagesWarnings_QNAME = new QName(NS_SO, "Warnings");
    private final static QName _TargetToolMessagesTermination_QNAME = new QName(NS_SO, "Termination");
    private final static QName _TargetToolMessagesElapsedTime_QNAME = new QName(NS_SO, "ElapsedTime");
    private final static QName _DiagnosticIndividualParamsIndivParamsCovariates_QNAME = new QName(NS_SO, "IndivParamsCovariates");
    private final static QName _DiagnosticIndividualParamsDistributionIndivParams_QNAME = new QName(NS_SO, "DistributionIndivParams");
    private final static QName _DiagnosticIndividualParamsRandomEffects_QNAME = new QName(NS_SO, "RandomEffects");
    private final static QName _InformationCriteriaDIC_QNAME = new QName(NS_SO, "DIC");
    private final static QName _InformationCriteriaAIC_QNAME = new QName(NS_SO, "AIC");
    private final static QName _InformationCriteriaBIC_QNAME = new QName(NS_SO, "BIC");
    private final static QName _IndividualEstimatesRandomEffectsEffectMode_QNAME = new QName(NS_SO, "EffectMode");
    private final static QName _IndividualEstimatesRandomEffectsEffectMedian_QNAME = new QName(NS_SO, "EffectMedian");
    private final static QName _IndividualEstimatesRandomEffectsEffectMean_QNAME = new QName(NS_SO, "EffectMean");
    private final static QName _IndividualEstimatesEstimatesMode_QNAME = new QName(NS_SO, "Mode");
    private final static QName _IndividualEstimatesEstimatesMean_QNAME = new QName(NS_SO, "Mean");
    private final static QName _IndividualEstimatesEstimatesMedian_QNAME = new QName(NS_SO, "Median");
    private final static QName _DiagnosticStructuralModelVPC_QNAME = new QName(NS_SO, "VPC");
    private final static QName _DiagnosticStructuralModelIndivObservationPrediction_QNAME = new QName(NS_SO, "IndivObservationPrediction");
    private final static QName _OFMeasuresToolObjFunction_QNAME = new QName(NS_SO, "ToolObjFunction");
    private final static QName _OFMeasuresInformationCriteria_QNAME = new QName(NS_SO, "InformationCriteria");
    private final static QName _OFMeasuresLikelihood_QNAME = new QName(NS_SO, "Likelihood");
    private final static QName _OFMeasuresIndividualContribToLL_QNAME = new QName(NS_SO, "IndividualContribToLL");
    private final static QName _OFMeasuresDeviance_QNAME = new QName(NS_SO, "Deviance");
    private final static QName _OFMeasuresLogLikelihood_QNAME = new QName(NS_SO, "LogLikelihood");
    
    private final static ObjectFactory instance = new ObjectFactory();

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ddmore.libpharmml.so.dom
     * 
     */
    public ObjectFactory() {
    }
    
    public static ObjectFactory getInstance(){
    	return instance;
    }

    /**
     * Create an instance of {@link PopulationEstimates }
     * 
     */
    public PopulationEstimates createPopulationEstimates() {
        return new PopulationEstimates();
    }

    /**
     * Create an instance of {@link PrecisionPopulationEstimates }
     * 
     */
    public PrecisionPopulationEstimates createPrecisionPopulationEstimates() {
        return new PrecisionPopulationEstimates();
    }

    /**
     * Create an instance of {@link IndividualEstimates }
     * 
     */
    public IndividualEstimates createIndividualEstimates() {
        return new IndividualEstimates();
    }

    /**
     * Create an instance of {@link StandardisedOutput }
     * 
     */
    public StandardisedOutput createStandardisedOutput() {
        return new StandardisedOutput();
    }

    /**
     * Create an instance of {@link OptimalDesignBlock }
     * 
     */
    public OptimalDesignBlock createOptimalDesignBlock() {
        return new OptimalDesignBlock();
    }

    /**
     * Create an instance of {@link TaskInformation }
     * 
     */
    public TaskInformation createTaskInformation() {
        return new TaskInformation();
    }

    /**
     * Create an instance of {@link ModelDiagnostic }
     * 
     */
    public ModelDiagnostic createModelDiagnostic() {
        return new ModelDiagnostic();
    }

    /**
     * Create an instance of {@link PharmMLRef }
     * 
     */
    public PharmMLRef createPharmMLRef() {
        return new PharmMLRef();
    }

    /**
     * Create an instance of {@link SOTableDistrib }
     * 
     */
    public SOTableDistrib createSOTableDistrib() {
        return new SOTableDistrib();
    }

    /**
     * Create an instance of {@link Residual }
     * 
     */
    public Residual createResidual() {
        return new Residual();
    }

    /**
     * Create an instance of {@link DiagnosticStructuralModel }
     * 
     */
    public DiagnosticStructuralModel createDiagnosticStructuralModel() {
        return new DiagnosticStructuralModel();
    }

    /**
     * Create an instance of {@link TargetToolMessages }
     * 
     */
    public TargetToolMessages createTargetToolMessages() {
        return new TargetToolMessages();
    }

    /**
     * Create an instance of {@link DiagnosticIndividualParams }
     * 
     */
    public DiagnosticIndividualParams createDiagnosticIndividualParams() {
        return new DiagnosticIndividualParams();
    }

    /**
     * Create an instance of {@link OFMeasures }
     * 
     */
    public OFMeasures createOFMeasures() {
        return new OFMeasures();
    }

    /**
     * Create an instance of {@link SimulationItem }
     * 
     */
    public SimulationItem createSimulationItem() {
        return new SimulationItem();
    }

    /**
     * Create an instance of {@link SOBlock }
     * 
     */
    public SOBlock createSOBlock() {
        return new SOBlock();
    }

    /**
     * Create an instance of {@link PrecisionEstimatesPercentile }
     * 
     */
    public PrecisionEstimatesPercentile createPrecisionEstimatesPercentile() {
        return new PrecisionEstimatesPercentile();
    }

    /**
     * Create an instance of {@link ToolObjFunction }
     * 
     */
    public ToolObjFunction createToolObjFunction() {
        return new ToolObjFunction();
    }

    /**
     * Create an instance of {@link RawResults }
     * 
     */
    public RawResults createRawResults() {
        return new RawResults();
    }

    /**
     * Create an instance of {@link PrecisionIndividualEstimates }
     * 
     */
    public PrecisionIndividualEstimates createPrecisionIndividualEstimates() {
        return new PrecisionIndividualEstimates();
    }

    /**
     * Create an instance of {@link InformationCriteria }
     * 
     */
    public InformationCriteria createInformationCriteria() {
        return new InformationCriteria();
    }

    /**
     * Create an instance of {@link Estimation }
     * 
     */
    public Estimation createEstimation() {
        return new Estimation();
    }

    /**
     * Create an instance of {@link SimulationBlock }
     * 
     */
    public SimulationBlock createSimulationBlock() {
        return new SimulationBlock();
    }

    /**
     * Create an instance of {@link SOMatrix }
     * 
     */
    public SOMatrix createSOMatrix() {
        return new SOMatrix();
    }

    /**
     * Create an instance of {@link Simulation }
     * 
     */
    public Simulation createSimulation() {
        return new Simulation();
    }

    /**
     * Create an instance of {@link Distribution }
     * 
     */
    public Distribution createDistribution() {
        return new Distribution();
    }

    /**
     * Create an instance of {@link ToolSettings }
     * 
     */
    public ToolSettings createToolSettings() {
        return new ToolSettings();
    }

    /**
     * Create an instance of {@link OptimalDesign }
     * 
     */
    public OptimalDesign createOptimalDesign() {
        return new OptimalDesign();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link PopulationEstimates.Bayesian }
     * 
     */
    public PopulationEstimates.Bayesian createPopulationEstimatesBayesian() {
        return new PopulationEstimates.Bayesian();
    }

    /**
     * Create an instance of {@link PopulationEstimates.OtherMethod }
     * 
     */
    public PopulationEstimates.OtherMethod createPopulationEstimatesOtherMethod() {
        return new PopulationEstimates.OtherMethod();
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
     * Create an instance of {@link PrecisionPopulationEstimates.OtherMethod }
     * 
     */
    public PrecisionPopulationEstimates.OtherMethod createPrecisionPopulationEstimatesOtherMethod() {
        return new PrecisionPopulationEstimates.OtherMethod();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardisedOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "SO")
    public JAXBElement<StandardisedOutput> createSO(StandardisedOutput value) {
        return new JAXBElement<StandardisedOutput>(_SO_QNAME, StandardisedOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "IterationNumber", scope = TargetToolMessages.class)
    public JAXBElement<RealValue> createTargetToolMessagesIterationNumber(RealValue value) {
        return new JAXBElement<RealValue>(_TargetToolMessagesIterationNumber_QNAME, RealValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "OutputFilePath", scope = TargetToolMessages.class)
    public JAXBElement<ExternalFile> createTargetToolMessagesOutputFilePath(ExternalFile value) {
        return new JAXBElement<ExternalFile>(_TargetToolMessagesOutputFilePath_QNAME, ExternalFile.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "ChainsNumber", scope = TargetToolMessages.class)
    public JAXBElement<RealValue> createTargetToolMessagesChainsNumber(RealValue value) {
        return new JAXBElement<RealValue>(_TargetToolMessagesChainsNumber_QNAME, RealValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Errors", scope = TargetToolMessages.class)
    public JAXBElement<StringValue> createTargetToolMessagesErrors(StringValue value) {
        return new JAXBElement<StringValue>(_TargetToolMessagesErrors_QNAME, StringValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Warnings", scope = TargetToolMessages.class)
    public JAXBElement<StringValue> createTargetToolMessagesWarnings(StringValue value) {
        return new JAXBElement<StringValue>(_TargetToolMessagesWarnings_QNAME, StringValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Termination", scope = TargetToolMessages.class)
    public JAXBElement<StringValue> createTargetToolMessagesTermination(StringValue value) {
        return new JAXBElement<StringValue>(_TargetToolMessagesTermination_QNAME, StringValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "ElapsedTime", scope = TargetToolMessages.class)
    public JAXBElement<RealValue> createTargetToolMessagesElapsedTime(RealValue value) {
        return new JAXBElement<RealValue>(_TargetToolMessagesElapsedTime_QNAME, RealValue.class, TargetToolMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "IndivParamsCovariates", scope = DiagnosticIndividualParams.class)
    public JAXBElement<DataSet> createDiagnosticIndividualParamsIndivParamsCovariates(DataSet value) {
        return new JAXBElement<DataSet>(_DiagnosticIndividualParamsIndivParamsCovariates_QNAME, DataSet.class, DiagnosticIndividualParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "DistributionIndivParams", scope = DiagnosticIndividualParams.class)
    public JAXBElement<DataSet> createDiagnosticIndividualParamsDistributionIndivParams(DataSet value) {
        return new JAXBElement<DataSet>(_DiagnosticIndividualParamsDistributionIndivParams_QNAME, DataSet.class, DiagnosticIndividualParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "RandomEffects", scope = DiagnosticIndividualParams.class)
    public JAXBElement<DataSet> createDiagnosticIndividualParamsRandomEffects(DataSet value) {
        return new JAXBElement<DataSet>(_DiagnosticIndividualParamsRandomEffects_QNAME, DataSet.class, DiagnosticIndividualParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "DIC", scope = InformationCriteria.class)
    public JAXBElement<RealValue> createInformationCriteriaDIC(RealValue value) {
        return new JAXBElement<RealValue>(_InformationCriteriaDIC_QNAME, RealValue.class, InformationCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "AIC", scope = InformationCriteria.class)
    public JAXBElement<RealValue> createInformationCriteriaAIC(RealValue value) {
        return new JAXBElement<RealValue>(_InformationCriteriaAIC_QNAME, RealValue.class, InformationCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "BIC", scope = InformationCriteria.class)
    public JAXBElement<RealValue> createInformationCriteriaBIC(RealValue value) {
        return new JAXBElement<RealValue>(_InformationCriteriaBIC_QNAME, RealValue.class, InformationCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "EffectMode", scope = IndividualEstimates.RandomEffects.class)
    public JAXBElement<DataSet> createIndividualEstimatesRandomEffectsEffectMode(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsEffectMode_QNAME, DataSet.class, IndividualEstimates.RandomEffects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "EffectMedian", scope = IndividualEstimates.RandomEffects.class)
    public JAXBElement<DataSet> createIndividualEstimatesRandomEffectsEffectMedian(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsEffectMedian_QNAME, DataSet.class, IndividualEstimates.RandomEffects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "EffectMean", scope = IndividualEstimates.RandomEffects.class)
    public JAXBElement<DataSet> createIndividualEstimatesRandomEffectsEffectMean(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesRandomEffectsEffectMean_QNAME, DataSet.class, IndividualEstimates.RandomEffects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Mode", scope = IndividualEstimates.Estimates.class)
    public JAXBElement<DataSet> createIndividualEstimatesEstimatesMode(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesEstimatesMode_QNAME, DataSet.class, IndividualEstimates.Estimates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Mean", scope = IndividualEstimates.Estimates.class)
    public JAXBElement<DataSet> createIndividualEstimatesEstimatesMean(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesEstimatesMean_QNAME, DataSet.class, IndividualEstimates.Estimates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Median", scope = IndividualEstimates.Estimates.class)
    public JAXBElement<DataSet> createIndividualEstimatesEstimatesMedian(DataSet value) {
        return new JAXBElement<DataSet>(_IndividualEstimatesEstimatesMedian_QNAME, DataSet.class, IndividualEstimates.Estimates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "VPC", scope = DiagnosticStructuralModel.class)
    public JAXBElement<DataSet> createDiagnosticStructuralModelVPC(DataSet value) {
        return new JAXBElement<DataSet>(_DiagnosticStructuralModelVPC_QNAME, DataSet.class, DiagnosticStructuralModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "IndivObservationPrediction", scope = DiagnosticStructuralModel.class)
    public JAXBElement<DataSet> createDiagnosticStructuralModelIndivObservationPrediction(DataSet value) {
        return new JAXBElement<DataSet>(_DiagnosticStructuralModelIndivObservationPrediction_QNAME, DataSet.class, DiagnosticStructuralModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToolObjFunction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "ToolObjFunction", scope = OFMeasures.class)
    public JAXBElement<ToolObjFunction> createOFMeasuresToolObjFunction(ToolObjFunction value) {
        return new JAXBElement<ToolObjFunction>(_OFMeasuresToolObjFunction_QNAME, ToolObjFunction.class, OFMeasures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "InformationCriteria", scope = OFMeasures.class)
    public JAXBElement<InformationCriteria> createOFMeasuresInformationCriteria(InformationCriteria value) {
        return new JAXBElement<InformationCriteria>(_OFMeasuresInformationCriteria_QNAME, InformationCriteria.class, OFMeasures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Likelihood", scope = OFMeasures.class)
    public JAXBElement<RealValue> createOFMeasuresLikelihood(RealValue value) {
        return new JAXBElement<RealValue>(_OFMeasuresLikelihood_QNAME, RealValue.class, OFMeasures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "IndividualContribToLL", scope = OFMeasures.class)
    public JAXBElement<DataSet> createOFMeasuresIndividualContribToLL(DataSet value) {
        return new JAXBElement<DataSet>(_OFMeasuresIndividualContribToLL_QNAME, DataSet.class, OFMeasures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "Deviance", scope = OFMeasures.class)
    public JAXBElement<RealValue> createOFMeasuresDeviance(RealValue value) {
        return new JAXBElement<RealValue>(_OFMeasuresDeviance_QNAME, RealValue.class, OFMeasures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = NS_SO, name = "LogLikelihood", scope = OFMeasures.class)
    public JAXBElement<RealValue> createOFMeasuresLogLikelihood(RealValue value) {
        return new JAXBElement<RealValue>(_OFMeasuresLogLikelihood_QNAME, RealValue.class, OFMeasures.class, value);
    }

}
