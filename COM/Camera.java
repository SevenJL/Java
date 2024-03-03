
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("开始工作！ ");
    }

    @Override
    public void stop() {
        System.out.println("停止工作！");
    }
}
