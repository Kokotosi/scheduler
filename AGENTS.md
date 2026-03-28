# Repository Agent Guide

This file is repository-local guidance for Codex and similar coding agents.

## Mission

Keep the repository a high-signal example of Kotlin/JVM library development with strong workflow hygiene.

## Default expectations

- Treat this as a library, not an application.
- Prefer small, reversible changes.
- Avoid adding framework weight before the execution model requires it.
- Keep package names, build metadata, and documentation internally consistent.

## Before coding

- Read `README.md` and the relevant source files first.
- Check whether the change should also update tests, docs, or GitHub workflow files.
- Preserve user changes you did not make.

## After coding

- Run the narrowest relevant Maven verification command.
- Mention any commands you could not run.
- Call out placeholders that still need the maintainer to decide, such as Maven coordinates or license choice.

## Architecture posture

Until the scheduler semantics are designed, optimize for clarity over completeness:

- Prefer explicit domain types over generic configuration maps.
- Do not introduce persistence or threading abstractions unless tests require them.
- Keep APIs narrow enough that they can still change.
