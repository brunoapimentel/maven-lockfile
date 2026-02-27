package io.github.chains_project.maven_lockfile.data;

import java.util.Objects;

public class Bom {

    private final String groupId;
    private final String artifactId;
    private final String version;
    private final String resolved;
    private final String repositoryId;
    private final String checksumAlgorithm;
    private final String checksum;
    private final Bom parent;

    public Bom(String groupId, String artifactId, String version, String resolved, String repositoryId, String checksumAlgorithm, String checksum, Bom parent) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.resolved = resolved;
        this.repositoryId = repositoryId;
        this.checksumAlgorithm = checksumAlgorithm;
        this.checksum = checksum;
        this.parent = parent;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getVersion() {
        return version;
    }

    public String getResolved() {
        return resolved;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public String getChecksumAlgorithm() {
        return checksumAlgorithm;
    }

    public String getChecksum() {
        return checksum;
    }

    public Bom getParent() {
        return parent;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bom bom = (Bom) o;
        return Objects.equals(groupId, bom.groupId) && Objects.equals(artifactId, bom.artifactId) && Objects.equals(version, bom.version) && Objects.equals(resolved, bom.resolved) && Objects.equals(repositoryId, bom.repositoryId) && Objects.equals(checksumAlgorithm, bom.checksumAlgorithm) && Objects.equals(checksum, bom.checksum) && Objects.equals(parent, bom.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, artifactId, version, resolved, repositoryId, checksumAlgorithm, checksum, parent);
    }
}
