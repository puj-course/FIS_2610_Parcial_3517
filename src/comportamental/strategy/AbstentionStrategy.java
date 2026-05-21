public class AbstentionStrategy
        implements ResultCalculationStrategy {
    @Override
    public double calculate(
            int totalVotes,
            int validVotes
    ) {
        return ((double)
                (totalVotes - validVotes)
                / totalVotes) * 100;
    }
}
