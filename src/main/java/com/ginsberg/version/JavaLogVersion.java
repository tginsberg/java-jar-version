package com.ginsberg.version;

public class JavaLogVersion {

    public void logVersion() {
        final Package logPackage = getClass().getPackage();
        System.out.printf("Application: %s, version: %s, by %s%n",
                logPackage.getImplementationTitle(),
                logPackage.getImplementationVersion(),
                logPackage.getImplementationVendor()
        );
    }
}
