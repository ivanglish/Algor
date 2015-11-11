class BinarySearch

  def initialize(array, element)
    @array = array
    @element = element
  end

  def find
    sorted = @array.sort
    low = 0
    high = @element.size - 1
    middle = (low + high) / 2
    while test = sorted[middle]
      if test > @element
        high -= 1
      elsif test < @element
        low += 1
      else
        return true
      end
      middle = (low + high) / 2
    end
    false
  end
end

@obj = BinarySearch.new([1,2,3,4,5], 3)
@obj.find
result = @obj.find
puts result
