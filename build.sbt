
// to release, bump major/minor/micro as appropriate,
// update NEWS, update version in README.md, drop SNAPSHOT,
// tag and publish.
// then add snapshot back so git master is upcoming release
// with -SNAPSHOT.
// when releasing a SNAPSHOT to the repo, bump the micro
// version at least.
// Versions and git tags should follow: http://semver.org/
// except using -SNAPSHOT instead of without hyphen.

version in GlobalScope := "1.0.2"

organization in GlobalScope := "nl.rhinofly.thirdparty"

scalacOptions in GlobalScope in Compile := Seq("-unchecked", "-deprecation")

scalacOptions in GlobalScope in Test := Seq("-unchecked", "-deprecation")
