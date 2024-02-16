public class SmartphoneMain {
    public static void main(String[] args) {

        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new Iphones();
        Androids linuxDevice = new Androids();
        LinuxOS linuxOS = linuxDevice;
        Iphones iosDevice = new Iphones();
        iOS ios = iosDevice;


        iPhone.call();
        androidPhone.sms();
        linuxDevice.internet();
        iosDevice.sms();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
    }
}