public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Kilo bytes cannot be negative");
        }else {
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and "+
                    kiloBytes%1024 + " KB");
        }
    }

}