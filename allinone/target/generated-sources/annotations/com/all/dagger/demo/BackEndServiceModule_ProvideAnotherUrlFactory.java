package com.all.dagger.demo;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BackEndServiceModule_ProvideAnotherUrlFactory implements Factory<String> {
  private final BackEndServiceModule module;

  public BackEndServiceModule_ProvideAnotherUrlFactory(BackEndServiceModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideAnotherUrl(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(BackEndServiceModule module) {
    return new BackEndServiceModule_ProvideAnotherUrlFactory(module);
  }
}
