package us.springett.maven.uuidgenerator;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import java.util.UUID;

@Mojo(
        name = "generate",
        defaultPhase = LifecyclePhase.INITIALIZE
)
public class MavenUuidGenerator extends AbstractMojo {

    @Parameter(property = "project", readonly = true, required = true)
    private MavenProject project;

    @Override
    public void execute() throws MojoExecutionException {
        final String uuid = UUID.randomUUID().toString();
        project.getProperties().setProperty("project.build.uuid", uuid);
    }

}
