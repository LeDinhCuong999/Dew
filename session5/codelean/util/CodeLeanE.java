package session5.codelean.util;

import session5.codelean.access.CodeLeanB;

public class CodeLeanE extends CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanB().methodPublic();
        new CodeLeanB().methodProtected();

        new CodeLeanE().methodProtected();
    }
}
