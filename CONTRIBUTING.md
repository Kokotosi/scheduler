# Contributing

## Working model

This project is meant to be a strong example of disciplined, AI-assisted open source development.

- Start with a concrete issue or a narrowly scoped design question.
- Keep changes small enough to review in one sitting.
- Update tests and docs in the same change when behavior moves.
- Prefer deleting unclear code over preserving speculative abstractions.

## Pull request standard

Each pull request should explain:

- The problem being solved.
- The chosen approach and its tradeoffs.
- Any API or persistence implications.
- The tests that prove the change.

## Contribution certification

This project uses the Developer Certificate of Origin (`DCO`) instead of a CLA.

By submitting a contribution, you certify that it complies with the terms in [DCO](/home/sankor/workspace/scheduler/DCO).

Add a sign-off to each commit:

```bash
git commit -s
```

If you forget, you can amend the most recent commit:

```bash
git commit --amend -s
```

## Source file licensing

Kotlin source files should use a minimal SPDX header instead of a full license boilerplate:

```kotlin
// SPDX-License-Identifier: Apache-2.0
```

## Codex usage standard

When using Codex or another coding agent:

- Provide the issue context and success criteria up front.
- Ask it to inspect the repository before proposing architecture.
- Require it to run the narrowest relevant verification command after edits.
- Reject output that adds complexity without a test or a motivating use case.

## Design bar

Scheduler libraries fail when they are vague about invariants. New changes should make these concerns clearer, not blurrier:

- Job identity and deduplication.
- Retry and failure semantics.
- Clock handling and timing guarantees.
- Persistence boundaries.
- Concurrency and backpressure behavior.
- Observability hooks.
