package edu.lmu.cs.xlg.carlos.entities;

public class ContinueStatement extends Statement {

    @Override
    public void analyze(AnalysisContext context) {
        if (!context.isInLoop()) {
            context.error("continue_not_in_loop");
        }
    }
}
