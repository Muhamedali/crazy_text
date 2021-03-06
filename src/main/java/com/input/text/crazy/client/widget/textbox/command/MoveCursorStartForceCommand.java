package com.input.text.crazy.client.widget.textbox.command;

import com.google.web.bindery.event.shared.Event;
import com.input.text.crazy.client.widget.textbox.DrawTextBox;
import com.input.text.crazy.client.widget.textbox.Text;

import javax.annotation.Nullable;

public class MoveCursorStartForceCommand extends SimpleCommand {

    { type = CommandType.MOVE_CURSOR_START_FORCE_COMMAND; }

    public MoveCursorStartForceCommand() {}

    public MoveCursorStartForceCommand(DrawTextBox textBox, @Nullable Event event) throws Exception {
        super(textBox, event);
    }

    @Override
    public boolean isExecutable() {
        return true;
    }

    @Override
    public boolean execute() throws Exception {
        caret.setCursorPosition(Text.BEFORE_TEXT_POSITION);
        return true;
    }

    @Override
    public Command prototype(final DrawTextBox textBox, @Nullable final Event event) throws Exception {
        return new MoveCursorStartForceCommand(textBox, event);
    }
}
