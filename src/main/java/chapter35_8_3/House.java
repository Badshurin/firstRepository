package chapter35_8_3;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.rmi.dgc.DGC;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class House<T> {
    private List<T> residents = new ArrayList<>();

    public void enter(T resident) {
        residents.add(resident);
    }

    public void leave(T resident) {
        residents.remove(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (this.residents.get(0) instanceof Dog) {
            builder.append("В доме собак находятся:\n");
            for (Object resident : residents) {
                builder.append(resident.toString()).append("\n");
            }
        }

        if (this.residents.get(0) instanceof Cat) {
            builder.append("В доме кошек находятся:\n");
            for (Object resident : residents) {
                builder.append(resident.toString()).append("\n");
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }

            @Override
            protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
                return super.loadClass(name, resolve);
            }

            @Override
            protected Object getClassLoadingLock(String className) {
                return super.getClassLoadingLock(className);
            }

            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                return super.findClass(name);
            }


            @Override
            public Enumeration<URL> getResources(String name) throws IOException {
                return super.getResources(name);
            }

            @Override
            protected URL findResource(String name) {
                return super.findResource(name);
            }

            @Override
            protected Enumeration<URL> findResources(String name) throws IOException {
                return super.findResources(name);
            }


            @Override
            protected Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase) throws IllegalArgumentException {
                return super.definePackage(name, specTitle, specVersion, specVendor, implTitle, implVersion, implVendor, sealBase);
            }

            @Override
            protected Package getPackage(String name) {
                return super.getPackage(name);
            }

            @Override
            protected Package[] getPackages() {
                return super.getPackages();
            }

            @Override
            protected String findLibrary(String libname) {
                return super.findLibrary(libname);
            }

            @Override
            public void setDefaultAssertionStatus(boolean enabled) {
                super.setDefaultAssertionStatus(enabled);
            }

            @Override
            public void setPackageAssertionStatus(String packageName, boolean enabled) {
                super.setPackageAssertionStatus(packageName, enabled);
            }

            @Override
            public void setClassAssertionStatus(String className, boolean enabled) {
                super.setClassAssertionStatus(className, enabled);
            }

            @Override
            public void clearAssertionStatus() {
                super.clearAssertionStatus();
            }
        };

        Class<Integer> integerClass = Integer.class;
        Class<String> stringClass1 = String.class;
        Class<String> stringClass= (Class<String>) "abc".getClass();

            Dog bruno = new Dog("Bruno");
        Puppy larsik = new Puppy("Larsik");
        Cat barsik = new Cat("Barsik");
        Kitten keksik = new Kitten("Keksik");

        House<Dog> dogHouse = new House<>();
        dogHouse.enter(bruno);
        dogHouse.enter(larsik);
//        dogHouse.enter(barsik);
        System.out.println(dogHouse.toString());

        House<Cat> catHouse = new House<>();
        catHouse.enter(barsik);
        catHouse.enter(keksik);
        System.out.println(catHouse.toString());
    }
}
