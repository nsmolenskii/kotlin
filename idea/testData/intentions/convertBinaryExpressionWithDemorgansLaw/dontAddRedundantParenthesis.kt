object O {
    fun foo(): Boolean = true
    fun bar(): Boolean = true
}
fun foo(p1: Boolean, p2: Boolean) {
    if (!(<caret>O.foo() || O.bar())) return
}