public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setTitle("Tnt Dump");
        new Thread(){
            public void run(){
                gui.addRow();
            }
        }.start();
        gui.setVisible(true);
        gui.setEnabled(true);

    }
}
