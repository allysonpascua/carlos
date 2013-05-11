package edu.lmu.cs.xlg.carlos.entities;

public class AfterStatement extends Statement {

    private Expression delayTime;
    private CallStatement callAfter;
    

    public AfterStatement(Expression delay, CallStatement call) {
    	this.delayTime = delay;
        this.callAfter = call;
    }

    public Expression getDelayTime() {
        return delayTime;
    }
    
    public CallStatement getCallAfter() {
        return callAfter;
    }

    @Override
    public void analyze(AnalysisContext context) {
    	//check if delay time arithmetic
    	//check second argument is a Call Statement

    	delayTime.analyze(context);
    	delayTime.assertArithmetic("after", context);

    	callAfter.analyze(context);
    }

    @Override
    public Statement optimize() {
        return this;
    }
}
