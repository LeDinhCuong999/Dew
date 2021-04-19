package session5.codelean.access;

public class CodeLeanA {
    public void methodPublic() {
        methodPrivate();
    }

    public void methodProtected() {
        methodPrivate();
    }

    public void methodDefault() {
        methodPrivate();
    }
    private void methodPrivate() {}
}
