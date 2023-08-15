package practise;

public class Mac {
  int inch;
  int ram;
  int cpu;
  Color color;

  private Mac(Builder builder){
    this.inch = builder.inch;
    this.ram = builder.ram;
    this.cpu = builder.cpu;
    this.color = builder.color;
  }

  public static Builder builder(){
    return new Builder();
  }

  @Override
  public String toString(){
    return "[inch = "+this.inch+", ram = "+this.ram+", cpu = "+this.cpu+", Color = "+this.color+"]";
  }

  public static class Builder {
    int inch;
    int ram;
    int cpu;
    Color color;

    public Builder inch(int inch){
      this.inch = inch;
      return this;
    }

    public Builder cpu(int cpu){
      this.cpu = cpu;
      return this;
    }

    public Builder color(Color color){
      this.color = color;
      return this;
    }

    public Builder ram(int ram){
      this.ram = ram;
      return this;
    }

    public Mac Build(Builder builder){
      return new Mac(this);
    }
  }

  public static void main(String[] args) {
    Mac mac = Mac.builder().color(Color.BLACK).cpu(8).ram(16).inch(15).Build(null);
    System.out.println(mac);
  }
}
