# scheduler

Experimental Kotlin/JVM scheduler library and learning project.

This repository is intentionally set up to optimize for three goals at the same time:

1. Learn Kotlin by building a real library instead of a throwaway demo app.
2. Learn a disciplined Codex-assisted development workflow with strong repository hygiene.
3. Create the foundations for an open source scheduler that can eventually combine the strongest ideas from systems like Proletarian, DB-Scheduler, and JobRunr.

## Current state

The code is in bootstrap mode. The repository currently prioritizes:

- A library-first project structure instead of an application template.
- Fast feedback through tests, formatting checks, and CI.
- Explicit contributor guidance so humans and Codex work the same way.
- GitHub automation for dependency updates, issue intake, and code scanning.

## Technology choices

- Java 21 runtime baseline.
- Kotlin on the JVM.
- Maven for the initial build because it is installed locally and provides a reliable bootstrap path in this environment.
- JUnit 5 for tests.
- Spotless for formatting checks.
- JaCoCo for coverage reporting.

Gradle is a reasonable future option if the project grows into a multi-module build and you want tighter Kotlin-native ergonomics. Starting with Maven here is a pragmatic bootstrap decision, not a long-term ideology.

## Local workflow

Run the main verification step:

```bash
mvn verify
```

Apply formatting locally:

```bash
mvn spotless:apply
```

Run tests only:

```bash
mvn test
```

## Development principles

- Keep the public API small until the core execution model is proven.
- Prefer executable examples and tests over speculative abstractions.
- Land small pull requests with one clear design decision each.
- Write down architectural decisions early when tradeoffs appear.
- Treat durability, idempotency, observability, and backpressure as first-class concerns.

## Near-term roadmap

- Define the first minimal scheduling model and terminology.
- Add architectural decision records under `docs/adr/`.
- Introduce integration tests against a real database.
- Split the build into modules once clear seams emerge, such as `scheduler-core` and storage implementations.
- Keep the Apache-2.0 and DCO contribution setup aligned with repository policy.

## Before publishing

The repository metadata still contains placeholders and assumptions:

- Review license metadata and contribution policy before publishing.
