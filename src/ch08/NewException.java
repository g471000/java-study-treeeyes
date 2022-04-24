package ch08;

public class NewException {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException spaceException) {
            System.out.println("Error Message: " + spaceException.getMessage());
            spaceException.printStackTrace();
            System.out.println("Please make more space and retry.");
        } catch (MemoryException memoryException) {
            System.out.println("Error Message: " + memoryException.getMessage());
            memoryException.printStackTrace();
            System.gc();
            System.out.println("Please try install again. Not enough memory right now.");
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
