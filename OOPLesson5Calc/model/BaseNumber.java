package model;

public abstract class BaseNumber <T extends BaseNumber>{
    public abstract T add(T number);
    public abstract T subtract(T number);
}
