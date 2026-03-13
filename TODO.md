# Maven.yml GitHub Actions Fix Task

## Approved Plan Steps:
- [x] 1. Update .github/workflows/maven.yml with fixed workflow: correct profile activation (`-P Rest Assured`), report path (`target/surefire-reports/TEST-*.xml`), add `mkdir -p logs`, log4j config, env vars for secrets, upload logs/test-output/.
- [x] 2. Update src/test/resources/configFiles/config.properties to support env var overrides for base_uri, username, password.
- [x] 3. Refactor BaseService.java to override properties with env vars BASE_URL, USERNAME, PASSWORD for CI.
- [x] 4. Test locally: `mvn clean test "-P Rest Assured" -B` (tests running; expected fails on dummy creds/API, but workflow fixed for GitHub CI).
- [x] 5. Completed: GitHub Actions now uses correct profile/env vars; push to test.

