# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 208, lane `ship`
- `stress`: `retry load`, score 160, lane `ship`
- `edge`: `worker slack`, score 186, lane `ship`
- `recovery`: `session drift`, score 138, lane `watch`
- `stale`: `queue pressure`, score 195, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
