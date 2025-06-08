package com.kakarote.generator;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratorTest {
    @Test
    public void usesConfiguredOutputDir() throws Exception {
        Path dir = Files.createTempDirectory("generator-test");
        System.setProperty("generator.output.dir", dir.toString());
        GlobalConfig config = Generator.getGlobalConfig();
        assertEquals(dir.toString(), config.getOutputDir());
    }
}
