package com.br.padroesdeprojetos.command;

public interface Command {
    public void execute();
    public void undo();
}
