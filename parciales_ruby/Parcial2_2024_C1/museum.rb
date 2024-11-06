require_relative "exhibition"

class Pavilion
  attr_reader :exhibitions, :name, :capacity

  def initialize(name, capacity)
    @name = name
    @capacity = capacity
    @exhibitions = Array.new
  end

  def add_exhibition(name, theme)
    if @exhibitions.size >= @capacity
      raise StandardError.new("Cannot add exhibition")
    end

    @exhibitions << Exhibition.new(name, theme)
  end

  def eql?(other)
    @name == other.name
    @capacity == other.capacity
  end

  def hash
    [@name, @capacity].hash
  end

  def to_s = "Pavilion #{@name} with cap #{@capacity}"
end

class Museum
  def initialize
    @pavilions = Hash.new
  end

  def add_exhibition(pavilion, name, theme)
    if @pavilions[pavilion] == nil
      @pavilions[pavilion] = pavilion
    end

    @pavilions[pavilion].add_exhibition(name, theme)
  end

  def pavilion_exhibits(pavilion) = @pavilions[pavilion]&.exhibitions

  def pavilions = @pavilions.values
end

class ThemedPavilion < Pavilion
  attr_reader :theme

  def initialize(name, capacity, theme)
    super(name, capacity)
    @theme = theme
  end

  def add_exhibition(name, theme)
    if theme != @theme
      raise StandardError.new("Theme does not match")
    end

    super(name, theme)
  end

  def eql?(other)
    @name == other.name
    @capacity == other.capacity
    @theme == other.theme
  end

  def hash
    [@name, @capacity, @theme].hash
  end

  def to_s = "#{@theme} Themed #{super}"
end
