public class SmartphoneMain {
    public static void main(String[] args) {

        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new Iphones();
        Androids android = new Androids();
        Iphones iphone = new Iphones();
        Androids linuxDevice = new Androids();
        LinuxOS linuxOS = linuxDevice;
        Iphones iosDevice = new Iphones();
        Ios ios = iosDevice;


        iPhone.call();
        androidPhone.sms();
        android.internet();
        iPhone.sms();
        linuxDevice.runLinuxCommands();
        iosDevice.runiOSCommands();
    }
}
