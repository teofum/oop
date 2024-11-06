require 'set/sorted_set'

class Section
  protected attr_reader :name

  def initialize(name)
    @name = name
  end

  def eql?(other) = @name == other.name
  def hash = @name.hash

  def to_s = @name
end

class Table
  include Comparable

  protected attr_reader :name, :capacity

  def initialize(name, capacity, section)
    @name = name
    @capacity = capacity
    @section = section
  end

  def <=>(other)
    c = other.capacity - @capacity
    return c unless c == 0
    @name <=> other.name
  end

  def to_s = "Table #{@name} for #{@capacity} people in section #{@section}"
end

class Restaurant
  def initialize(name)
    @name = name
    @sections = Hash.new
  end

  def add_table(section, name, capacity)
    @sections[section] = SortedSet.new unless @sections.has_key?(section)
    @sections[section].add(Table.new(name, capacity, section))
  end

  def tables(section)
    raise ArgumentError.new('Section does not exist') unless @sections.has_key?(section)
    @sections[section]
  end

  def sections_count
    @sections.size
  end

  def tables_count(section)
    raise ArgumentError.new('Section does not exist') unless @sections.has_key?(section)
    @sections[section].size
  end
end
