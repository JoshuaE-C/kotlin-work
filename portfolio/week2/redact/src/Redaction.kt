// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(doc: String, text: String, red: Char = 'X'): String {
    var redactedString = doc
    var replacement = ""
    for (n in 1..text.length) {
        replacement = replacement + red
    }
    redactedString = redactedString.replace(text,replacement)

    return redactedString
}