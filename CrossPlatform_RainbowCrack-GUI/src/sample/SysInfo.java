package sample;

public class SysInfo {

    public static String GetOperatingSystem() {
        String osname = System.getProperty("os.name").toLowerCase();
        return
                osname.contains("win") ? "windows" :
                osname.contains("mac") ? "mac":
                osname.contains("linux") ? "linux" :
                osname.contains("nix") ? "unix" :
                "other";
    }

    public static String GetSystemVersion() {
        return System.getProperty("os.version");
    }

    public static int GetSystemArchitecture() {
        String osarch = System.getProperty("os.arch").toLowerCase();
        return osarch.contains("64") ? 64 : 32;
    }
}
