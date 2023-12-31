package net.media.training.designpattern.command;

import java.io.File;

public class DeleteCommand implements Command {
    private final String fileName;

    public DeleteCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        file.delete();
    }

    @Override
    public void undo() {
        // Restore the deleted file (if possible)
    }
}

