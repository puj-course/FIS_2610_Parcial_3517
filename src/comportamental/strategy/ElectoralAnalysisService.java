public class ElectoralAnalysisService {
    private ResultCalculationStrategy strategy;
    public ElectoralAnalysisService(
            ResultCalculationStrategy strategy
    ) 
  {
        this.strategy = strategy;
    }
    public double executeAnalysis(
            int totalVotes,
            int validVotes
    ) 
  {
        return strategy.calculate(
               totalVotes,
                validVotes
        );
    }
}
