package ch08;

import java.io.Closeable;

public class TryWithResource {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException we) {
            we.printStackTrace();
        } catch (CloseException ce) {
            ce.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException we) {
            we.printStackTrace();
        } catch (CloseException ce) {
           ce.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ") is called");
        if (exception) {
            throw new WorkException("WorkException Caused!");
        }
    }

    @Override
    public void close() throws CloseException {
        System.out.println("called close.");
        throw new CloseException("CloseException caused");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}

class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}
