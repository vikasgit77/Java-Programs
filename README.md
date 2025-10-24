# Java Programs — feature/Programs

This directory contains small Java programs and examples used for learning, demos, or utility tasks. Each program is intended to be simple, self-contained, and easy to compile/run from the command line. Use this README to understand the structure, requirements, and how to add or run programs.

## Table of contents
- Overview
- Requirements
- Directory structure
- How to compile & run
    - Single-file programs
    - Multiple-file / package programs
    - Using an IDE
- Naming & contribution guidelines
- Tests
- Troubleshooting
- License & contact

## Overview
The programs in this folder demonstrate common Java concepts (data structures, algorithms, file I/O, concurrency, etc.) or provide small utilities. Each program should include a short comment at the top describing its purpose and any assumptions.

## Requirements
- Java Development Kit (JDK) 8 or later (JDK 11+ recommended)
- javac and java available on your PATH

Optional:
- Maven or Gradle if you choose to add build tooling later
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java extensions

To check your Java version:
```bash
java -version
javac -version
```

## Directory structure
Assumed layout:
- feature/Programs/
    - README.md (this file)
    - src/ (optional — for package-based programs)
    - <ProgramName>.java (single-file programs)
    - utils/ (optional utilities used by multiple programs)

If programs are organized into packages, they should reside under `src/` following the package directory structure (for example `src/com/example/MyApp.java`).

## How to compile & run

### Single-file (no package)
If the file has no package declaration (e.g., HelloWorld.java):
```bash
# Compile
javac HelloWorld.java

# Run
java HelloWorld
```

### Multiple files or with packages
If files use packages, use the source root and package structure. Example:
Project structure:
```
src/
  com/example/greeter/Greeter.java
```
Build and run:
```bash
# From feature/Programs (project root)
javac -d out src/com/example/greeter/*.java
java -cp out com.example.greeter.Greeter
```

### With an IDE
- Import the directory as a project (or create a new project and add sources).
- Ensure the correct JDK is selected.
- Use the IDE run configuration for the main class.

## Adding a new program
- Name the file clearly (e.g., ReverseString.java, BinarySearch.java).
- Add a brief header comment describing:
    - Purpose
    - Input / output
    - Example usage
- If the program uses packages, place it under `src/<your/package/path>/`.
- Keep methods small and well-documented.
- Add example input and expected output as comments or in a separate examples/ folder.

Suggested file header example:
```java
/**
 * ReverseString.java
 * Reverses a string provided as a single command-line argument.
 *
 * Usage:
 *   java ReverseString "hello"
 * Output:
 *   olleh
 */
```

## Tests
- There are no automated tests by default. Consider adding unit tests (JUnit) if a program grows in complexity.
- For manual testing, include sample inputs and expected outputs in comments or a `tests/` folder.

## Troubleshooting
- ClassNotFoundException or NoClassDefFoundError:
    - Ensure you run `java` with the correct classpath and that classes were compiled into the directory you specify with `-d`.
- Package-related errors:
    - Verify the `package` declaration matches the directory path under the source root.
- Encoding issues:
    - Use UTF-8 encoding when saving source files and include `-encoding UTF-8` when compiling if necessary.

## Contributing
- Open a pull request with your new program or improvements.
- Include comments, usage examples, and any edge cases handled.
- Keep code readable and follow common Java conventions (CamelCase class names, meaningful variable names).

## License & contact
- Add a LICENSE file at the repository root or indicate the project's license here.
- For questions or suggestions, contact: vikasgit77 (GitHub username)

---

If you'd like, I can:
- Generate a template Java program and place it under feature/Programs/src/
- Create an example build script for Maven/Gradle
- List the current Java files in this directory and produce an index of programs

Tell me which of the above you'd like next.