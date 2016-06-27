# Override

Example of how to override method of parent class using Employee and Manager classes.

In the TestOverride example all employees get a bonus of 10% in their salaries but managers get 15%. So I rewrite the method in Manager class to return the correct value.

In the TestOverrideWithSuper all Managers Plus get an additional value of 1000 over the other employees bonus. So I use super to get bonus of parent class an then add 1000 to the value returned.
