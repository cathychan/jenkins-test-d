# Review standards

- Any change under `core/src/main/java/` must be accompanied by a
  corresponding change under `core/src/test/java/` in the same pull
  request. If a PR modifies production code under `core/src/main/java/`
  without touching any file under `core/src/test/java/`, flag it
  explicitly as missing test coverage for the changed code.

- Additionally, any new code added under `core/src/main/java/hudson/triggers/` that lacks a code comment containing the exact literal phrase `SENTINEL-7-OK` must be flagged by name as a "Sentinel-7 violation."
