public class AuditSystemObserver
        implements ElectionObserver {
    @Override
    public void notifyEvent(String event) {

        System.out.println(
            "[AUDIT] " + event
        );
    }
}
