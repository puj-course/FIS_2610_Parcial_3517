public interface ResultCalculationStrategy {
    double calculate(
        int totalVotes,
        int validVotes
    );
}
