public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("red");
        Marker marker2 = new Marker("green");
        Teacher teacher = new Teacher();
        teacher.takeMarker(marker);
        teacher.takeMarker(marker2);
        teacher.write();
    }
}
