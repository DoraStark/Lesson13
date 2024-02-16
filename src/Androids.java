public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call() {
        System.out.println("Calling from Android phone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android phone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from Android phone");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Running Linux commands");
    }
}
