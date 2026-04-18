package be.renaud11232.bluemapentities.textures;

import be.renaud11232.bluemapentities.textures.converter.TextureConverter;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Mojo(name = "convert")
public class ConvertCommandMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    private MavenProject project;

    @Override
    public void execute() throws MojoExecutionException {
        var converter = new TextureConverter();
        for (var resource : project.getResources()) {
            var directory = Path.of(resource.getDirectory());
            if (Files.notExists(directory)) {
                continue;
            }
            try (var files = Files.walk(directory)) {
                for (var file : files.toList()) {
                    try {
                        if (converter.convert(file)) {
                            getLog().info("Converted texture file: " + file);
                        }
                    } catch (IOException e) {
                        getLog().warn("Failed to convert texture file: " + file, e);
                    }
                }
            } catch (IOException e) {
                throw new MojoExecutionException(e);
            }
        }
    }
}
