package com.learning.java8.Java8NewFeatureDurgaSoft.LeetProblem3;

public class BuilderPatternTest {

    String name;
    int age;
    String caste;

    public BuilderPatternTest(Builder builder) {
        this.name = builder.getName();
        this.age= builder.getAge();
        this.caste= builder.getCaste();
    }

    static class Builder{

        String name;
        int age;
        String caste;

        public Builder() {
            this.name = "temp";
            this.age = 20;
            this.caste = "Hindu";
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getCaste() {
            return caste;
        }

        public Builder setCaste(String caste) {
            this.caste = caste;
            return this;
        }

        public BuilderPatternTest build(){
            return new BuilderPatternTest(this);
        }
    }


    public static void main(String[] args) {

        BuilderPatternTest builderPatternTest = new BuilderPatternTest.Builder().setAge(10).setCaste("Hindu").build();

        System.out.println(builderPatternTest.age);
        System.out.println(builderPatternTest.name);
        System.out.println(builderPatternTest.caste);





    }
}
