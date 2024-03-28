package edu.iu.habahram.ducksservice.model;

public record Customer (String username,
                        String password,
                        String email) {
    public static Customer fromLine(String line) {
        String[] tokens = line.split(",");
        return new Customer(tokens[0],tokens[1],tokens[2]);
    }

}
