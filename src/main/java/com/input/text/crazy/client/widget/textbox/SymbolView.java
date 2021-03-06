package com.input.text.crazy.client.widget.textbox;

import com.google.gwt.canvas.client.Canvas;

public class SymbolView implements ElementView {

    protected Symbol symbol;

    public SymbolView(Symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public void draw(Canvas canvas) {
        assert canvas != null;
        assert symbol != null;

        canvas.getContext2d().fillText(
                symbol.getSymbol(),
                symbol.getX(),
                symbol.getBaseline()
        );
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
