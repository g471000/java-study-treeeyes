package ch08;

public class NewException {
    public static void main(String[] args) throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException spaceException) {
            InstallException ie = new InstallException("Exception while installing.");
            ie.initCause(spaceException);
            throw ie;
        } catch (MemoryException memoryException) {
            InstallException ie = new InstallException("Exception while installing.");
            ie.initCause(memoryException);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("Not enough space.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("Not enough memory.");
        }
    }

    static void copyFiles() {
        System.out.println("Copying files...");
    }

    static void deleteTempFiles() {
        System.out.println("Deleting temporary files...");
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return false;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}
