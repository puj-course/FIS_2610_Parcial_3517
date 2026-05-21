public class ParticipationStrategy
        implements ResultCalculationStrategy {
    @Override
    public double calculate(
            int totalVotes,
            int validVotes
    ) 
      {
        return ((double) validVotes
                / totalVotes) * 100;
    }
}
