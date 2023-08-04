import cv2

# Load an image in grayscale
image = cv2.imread('Assets/eiffelTower.jpg', cv2.IMREAD_GRAYSCALE)

# Calculate gradients using Sobel operator
grad_x = cv2.Sobel(image, cv2.CV_64F, 1, 0, ksize=3)
grad_y = cv2.Sobel(image, cv2.CV_64F, 0, 1, ksize=3)

# Calculate gradient magnitude and angle
gradient_magnitude = cv2.magnitude(grad_x, grad_y)
gradient_angle = cv2.phase(grad_x, grad_y, angleInDegrees=True)

# Apply Canny edge detection
canny_edges = cv2.Canny(image, threshold1=100, threshold2=200)

# Display results
cv2.imshow('Original Image', image)
cv2.imshow('Gradient Magnitude', gradient_magnitude)

cv2.imshow('Canny Edge Detection', canny_edges)

cv2.waitKey(0)
cv2.destroyAllWindows()
