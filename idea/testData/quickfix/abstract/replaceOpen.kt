// "Make 'foo' 'abstract'" "true"
abstract class B() {
    open fun <caret>foo()
}
/* FIR_COMPARISON */
