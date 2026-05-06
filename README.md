# harbor-svc-profile-pipe

`harbor-svc-profile-pipe` keeps a focused Kotlin implementation around backend services. The project goal is to design a Kotlin verification harness for profile systems, covering simulation kernel, seeded input scenarios, and failure-oriented tests.

## Why It Exists

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Harbor Svc Profile Pipe Review Notes

The first comparison I would make is `queue pressure` against `session drift` because it shows where the rule is most opinionated.

## Features

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/harbor-svc-profile-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `session drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin code keeps the review rule close to the tests.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Limitations And Roadmap

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
